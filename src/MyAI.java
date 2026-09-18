/**
 * STUDENT FILE
 *
 * Name: ______________________________
 * AI Code Name: ______________________
 *
 * Strategy Description:
 * Replace this comment with a short explanation of the strategy your AI uses.
 * Your final strategy must be fundamentally different from the sample AIs.
 */
public class MyAI extends CellAI {

    @Override
    public String getAIName() {
        return "MyAI - CHANGE ME";
    }

    @Override
    public Location select(Grid grid) {
        boolean leftFriendlyNeighbor = false;
        boolean rightFriendlyNeighbor = false;
        boolean topFriendlyNeighbor = false;
        boolean bottomFriendlyNeighbor = false;
        boolean topRightFriendlyNeighbor = false;
        boolean topLeftFriendlyNeighbor = false;
        boolean bottomRightFriendlyNeighbor = false;
        boolean bottomLeftFriendlyNeighbor = false;
        boolean leftEnemyNeighbor = false;
        boolean rightEnemyNeighbor = false;
        boolean topEnemyNeighbor = false;
        boolean bottomEnemyNeighbor = false;
        boolean topRightEnemyNeighbor = false;
        boolean topLeftEnemyNeighbor = false;
        boolean bottomRightEnemyNeighbor = false;
        boolean bottomLeftEnemyNeighbor = false;
        for (int r = 0; r < grid.getRows(); r++) {
            for (int c = 0; c < grid.getCols(); c++) {
                if (grid.getCell(r, c) == getID()) {
                    if (r > 0) {
                        if (grid.getCell(r - 1, c) == getID()) {
                            topFriendlyNeighbor = true;
                        } else if (grid.getCell(r - 1, c) != -1) {
                            topEnemyNeighbor = true;
                        }
                    }
                    if (r < grid.getRows() - 1) {
                        if (grid.getCell(r + 1, c) == getID()) {
                            bottomFriendlyNeighbor = true;
                        } else if (grid.getCell(r + 1, c) != -1) {
                            bottomEnemyNeighbor = true;
                        }
                    }
                    if (c > 0) {
                        if (grid.getCell(r, c - 1) == getID()) {
                            leftFriendlyNeighbor = true;
                        } else if (grid.getCell(r, c - 1) != -1) {
                            leftEnemyNeighbor = true;
                        }
                    }
                    if (c < grid.getCols() - 1) {
                        if (grid.getCell(r, c + 1) == getID()) {
                            rightFriendlyNeighbor = true;
                        } else if (grid.getCell(r, c + 1) != -1) {
                            rightEnemyNeighbor = true;
                        }
                    }
                    if (r > 0 && c < grid.getCols() - 1) {
                        if (grid.getCell(r - 1, c + 1) == getID()) {
                            topRightFriendlyNeighbor = true;
                        } else if (grid.getCell(r - 1, c + 1) != -1) {
                            topRightEnemyNeighbor = true;
                        }
                    }
                    if (r > 0 && c > 0) {
                        if (grid.getCell(r - 1, c - 1) == getID()) {
                            topLeftFriendlyNeighbor = true;
                        } else if (grid.getCell(r - 1, c - 1) != -1) {
                            topLeftEnemyNeighbor = true;
                        }
                    }
                    if (r < grid.getRows() - 1 && c < grid.getCols() - 1) {
                        if (grid.getCell(r + 1, c + 1) == getID()) {
                            bottomRightFriendlyNeighbor = true;
                        } else if (grid.getCell(r + 1, c + 1) != -1) {
                            bottomRightEnemyNeighbor = true;
                        }
                    }
                    if (r < grid.getRows() - 1 && c > 0) {
                        if (grid.getCell(r + 1, c - 1) == getID()) {
                            bottomLeftFriendlyNeighbor = true;
                        } else if (grid.getCell(r + 1, c - 1) != -1) {
                            bottomLeftEnemyNeighbor = true;
                        }
                    }
                    if(topFriendlyNeighbor && bottomFriendlyNeighbor)
                    {
                        return new Location(r, c+1);
                    }
                }
            }
        }
        /*
         * Replace this starter strategy.
         *
         * Helpful information:
         *   getID()                     -> your cell ID
         *   grid.getRows()              -> number of rows
         *   grid.getCols()              -> number of columns
         *   grid.getCell(r, c)          -> -1 if dead, otherwise an AI ID
         *   GridFunctions.getNeighbors  -> number of living neighbors
         *   GridFunctions.mostCommonNeighbor -> most common neighboring AI
         *   randomInt(bound)            -> reproducible random integer
         */
        return new Location(0, 0);
    }
}
