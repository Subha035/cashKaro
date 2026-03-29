import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * CashKaro Student Acquisition Strategy - Kotlin UI Prototype
 * 
 * This Android Jetpack Compose prototype implements the core solutions to the problem statement:
 * 1. Awareness: Educational Student Onboarding
 * 2. Quality/Trust: College-verified specific deals & transparent cashback tracking UI
 * 3. First Transaction: Gamified "First Purchase" bonus explicitly visible
 */

@Composable
fun CashKaroStudentApp() {
    var currentScreen by remember { mutableStateOf("onboarding") }

    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            when (currentScreen) {
                "onboarding" -> StudentOnboardingScreen(
                    onComplete = { currentScreen = "home" }
                )
                "home" -> StudentHomeScreen()
            }
        }
    }
}

@Composable
fun StudentOnboardingScreen(onComplete: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Welcome to CashKaro Student",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFE85D04),
            textAlign = TextAlign.Center
        )
        
        Spacer(modifier = Modifier.height(32.dp))
        
        // Objective 1: Increase Student Awareness
        FeatureCard(
            title = "Why Pay Full Price?",
            description = "Most students don't know they can get up to 20% back on Myntra, Amazon, and Swiggy. Be the smart shopper in your campus."
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        // Addressing Core Problem: Trust and Educational building
        FeatureCard(
            title = "Real Money, Real Bank",
            description = "Unlike random reward points, withdraw your cashback directly to your bank account or as Amazon Pay balance. 100% Genuine."
        )

        Spacer(modifier = Modifier.height(48.dp))
        
        Button(
            onClick = onComplete,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE85D04)),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text("Verify College ID & Start Earning", fontSize = 18.sp, color = Color.White)
        }
    }
}

@Composable
fun StudentHomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Objective 3: Encourage First Transaction with UI/Trust building
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0)),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "🎉 Welcome Bonus for Students!",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color(0xFFE65100)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Complete your FIRST transaction in the next 48 hours and get a Flat ₹200 Extra Cashback. Guaranteed.",
                    textAlign = TextAlign.Center,
                    color = Color.DarkGray
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = { /* Handle Shop Now action */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE65100))
                ) {
                    Text("Make First Transaction Now")
                }
            }
        }
        
        Spacer(modifier = Modifier.height(24.dp))
        
        // Objective 2: Improve Quality of acquired users (College specific targeting)
        Text(
            text = "Trending in Your College",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            DealItem("Swiggy", "Flat 50% Off\n+ 10% Cashback", Color(0xFFFF9800))
            DealItem("Myntra", "Up to 80% Off\n+ 6% Cashback", Color(0xFFE91E63))
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            DealItem("Dominos", "Buy 1 Get 1\n+ ₹50 Cashback", Color(0xFF2196F3))
            DealItem("Amazon", "Student Prime\n+ 5% Cashback", Color(0xFF00BCD4))
        }
    }
}

@Composable
fun FeatureCard(title: String, description: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = title, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = description, color = Color.Gray)
        }
    }
}

@Composable
fun DealItem(brand: String, offer: String, bgColor: Color) {
    Card(
        modifier = Modifier
            .width(160.dp)
            .height(120.dp),
        colors = CardDefaults.cardColors(containerColor = bgColor.copy(alpha = 0.1f))
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = brand, fontWeight = FontWeight.Bold, fontSize = 18.sp, color = bgColor)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = offer, textAlign = TextAlign.Center, fontSize = 14.sp)
        }
    }
}
