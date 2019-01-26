package sk.mockito.learn;

public class Business {
    private DataService dataService;

    public Business(DataService dataService) {
        this.dataService = dataService;
    }

    int findGreatestFromData() {
        int[] data = dataService.retrieveData();
        int greatest = Integer.MIN_VALUE;
        for(int val : data){
            if (val > greatest) {
                greatest = val;
            }
        }
        return greatest;
    }
}