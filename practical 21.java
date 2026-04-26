class VotingApp {
    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        VotingApp app = new VotingApp();

        int[] ages = {16, 18, 25};

        for (int age : ages) {
            try {
                System.out.println("Checking age: " + age);
                app.checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }
        }
    }
}