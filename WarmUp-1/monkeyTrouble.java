Warm-Up 1 : monkeyTrouble

We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//Returning if aSmile & bSmile are both true OR aSmile & bSmile are both false
  return aSmile && bSmile || !aSmile && !bSmile;
}
