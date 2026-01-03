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
}