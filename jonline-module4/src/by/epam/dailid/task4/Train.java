package by.epam.dailid.task4;

class Train {

    private String finalDestination;
    private int numOfTrain;
    private float timeOfDeparture;

    public Train(){}

    public Train(String finalDestination, int numOfTrain, float timeOfDeparture) {
        this.finalDestination = finalDestination;
        this.numOfTrain = numOfTrain;
        this.timeOfDeparture = timeOfDeparture;
    }

    public void setfinalDestination() {
        this.finalDestination = finalDestination;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setNumOfTrain() {
        this.numOfTrain = numOfTrain;
    }

    public int getNumOfTrain() {
        return numOfTrain;
    }

    public void setTimeOfDeparture() {
        this.timeOfDeparture = timeOfDeparture;
    }

    public float getTimeOfDeparture() {
        return timeOfDeparture;
    }

    @Override
    public String toString() {
        return "Train{" +
                "finalDestination='" + finalDestination + '\'' +
                ", numOfTrain=" + numOfTrain +
                ", timeOfDeparture=" + timeOfDeparture +
                '}';
    }
}