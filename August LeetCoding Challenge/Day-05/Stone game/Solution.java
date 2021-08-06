class Solution {
    public boolean stoneGame(int[] piles) {
        return true;
    }
}

// Intuition and Algorithm

// Alex clearly always wins the 2 pile game. With some effort, we can see that she always wins the 4 pile game.

// If Alex takes the first pile initially, she can always take the third pile. If she takes the fourth pile initially, she can always take the second pile. At least one of first + third, second + fourth is larger, so she can always win.

// We can extend this idea to N piles. Say the first, third, fifth, seventh, etc. piles are white, and the second, fourth, sixth, eighth, etc. piles are black. Alex can always take either all white piles or all black piles, and one of the colors must have a sum number of stones larger than the other color.

// Hence, Alex always wins the game.
