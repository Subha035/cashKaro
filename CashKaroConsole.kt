fun main() {
    println("====================================================")
    println("   CASHKARO STUDENT ACQUISITION SYSTEM (SIMULATOR)   ")
    println("====================================================\n")

    // Define the simulation environment
    val campusAmbassador = "Rahul (IIT Delhi)"
    val studentName = "Aman"
    val isVerifiedStudent = true

    println("Phase 1: Awareness & Acquisition")
    println("--------------------------------")
    println("Campus Ambassador $campusAmbassador shared a referral link with $studentName.")
    
    if (isVerifiedStudent) {
        println("$studentName verified their college ID. Trust Hook Successful!")
        println("Welcome Bonus Added: ₹50 (Locked until 1st Transaction)\n")
    }

    println("Phase 2: Funnel Optimization (Trigger)")
    println("--------------------------------------")
    val recentSearch = "Pizza"
    println("$studentName searched for '$recentSearch'. Triggering Push Notification: 'Special Student Deal on Swiggy!'")
    println("Logic: Combine Swiggy 50% Off + CashKaro 10% Cashback.\n")

    println("Phase 3: First Transaction & Conversion")
    println("--------------------------------------")
    val purchaseAmount = 300.0
    val cashbackRate = 0.10
    
    println("$studentName made their first purchase of ₹$purchaseAmount.")
    val earnedCashback = purchaseAmount * cashbackRate
    val firstPurchaseBonus = 100.0
    val totalReward = earnedCashback + firstPurchaseBonus + 50.0 // Including onboarding bonus

    println(">>> TRANSACTION TRACKED! <<<")
    println("Standard Cashback: ₹$earnedCashback")
    println("First Purchase Bonus: ₹$firstPurchaseBonus")
    println("Onboarding Bonus Unlocked: ₹50")
    println("TOTAL CASHKARO REWARD: ₹$totalReward")
    
    println("\n====================================================")
    println("STRATEGY SUMMARY: Acquisition complete - LTV > SAC")
    println("Awareness: [Ambassador Link] -> COMPLETE")
    println("Quality: [ID Verification] -> COMPLETE")
    println("Trust: [Fast Cashback Tracked] -> COMPLETE")
    println("====================================================")
}
