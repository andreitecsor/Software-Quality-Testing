package tecsor.andrei.g1087.flyweight;

import java.time.LocalDate;

public class BadgeDetails {
    private String userDisplayName;
    private String challengeLogoPath;
    private LocalDate earnedAt;

    public BadgeDetails(String userDisplayName, String challengeLogoPath, LocalDate earnedAt) {
        this.userDisplayName = userDisplayName;
        this.challengeLogoPath = challengeLogoPath;
        this.earnedAt = earnedAt;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public String getChallengeLogoPath() {
        return challengeLogoPath;
    }

    public LocalDate getEarnedAt() {
        return earnedAt;
    }
}
