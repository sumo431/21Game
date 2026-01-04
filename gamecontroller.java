@RestController
public class GameController{
    in currentNUmber = 0;
    int players = 0;
    Random rand = new Random();

    @PostMapping("/start")
    public void start(@RequestParam int p){
        players = p;
        currentNumber = 0;
    }
    @GetMapping("/turn")
    public Map<String, Object> turn(){
        int player = rand.nextInt(players);
        int step = rand.nextInt(3) + 1;
        boolen gameOver = false;
        for(int i = 0; i < step; i++){
            currentNumber++;
            if(currentNumber == 21){
                gameOver = true;
                break;
            }
        }
        Map<String, Object> response = new HashMap<>();
        response.put("player", player + 1);
        response.put("step", step);
        response.put("currentNumber", currentNumber);
        response.put("gameOver", gameOver);
        return response;
    }
}