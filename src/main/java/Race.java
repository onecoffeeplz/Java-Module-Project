public class Race {
    String leaderName = "";
    int leaderDistance = 0;

    public void isLeader(Car car) {
        int distance = 24 * car.velocity;
        if (distance > leaderDistance) {
            leaderName = car.name;
            leaderDistance = distance;
        }
    }

    public String getLeaderName() {
        return leaderName;
    }
}
