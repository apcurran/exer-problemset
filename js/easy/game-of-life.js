export class GameOfLife {
    /**
     * @param {number[][]} matrix
     */
    constructor(matrix) {
        this.board = matrix;
    }

    tick() {
        if (this.board.length === 0) {
            return;
        }

        const rows = this.board.length;
        const cols = this.board[0].length;
        const boardCopy = this.board.map((row) => [...row]);

        const directions = [
            [-1, -1],
            [-1, 0],
            [-1, 1],
            [0, -1],
            [0, 1],
            [1, -1],
            [1, 0],
            [1, 1],
        ];
        // calculate new board state
        // After each generation, the cells interact with their eight neighbors,
        // which are cells adjacent horizontally, vertically, or diagonally.
        // Any live cell with two or three live neighbors lives on.
        // Any dead cell with exactly three live neighbors becomes a live cell.
        // All other cells die or stay dead.

        for (let row = 0; row < rows; row++) {
            for (let col = 0; col < cols; col++) {
                const currentCell = this.board[row][col];
                let aliveNeighborCellsCount = 0;
                // check 8 neighbor cells for status
                for (let [rowOffset, colOffset] of directions) {
                    const neighborRow = row + rowOffset;
                    const neighborCol = col + colOffset;

                    // ignore neighbors outside of the board
                    if (
                        neighborRow < 0 ||
                        neighborRow >= rows ||
                        neighborCol < 0 ||
                        neighborCol >= cols
                    ) {
                        continue;
                    }

                    // valid cell confirmed now...
                    if (this.board[neighborRow][neighborCol] === 1) {
                        aliveNeighborCellsCount++;
                    }
                }

                // make decision
                if (
                    currentCell === 1 &&
                    (aliveNeighborCellsCount === 2 || aliveNeighborCellsCount === 3)
                ) {
                    boardCopy[row][col] = 1;
                } else if (currentCell === 0 && aliveNeighborCellsCount === 3) {
                    boardCopy[row][col] = 1;
                } else {
                    boardCopy[row][col] = 0;
                }
            }
        }

        // replace old board with updated state
        this.board = boardCopy;
    }

    state() {
        return this.board;
    }
}

const matrix = [
    [1, 0, 1],
    [1, 0, 1],
    [1, 0, 1],
];
const game = new GameOfLife(matrix);
game.tick();
console.log(game.state());
//  const expected = [
//   [0, 0, 0],
//   [1, 0, 1],
//   [0, 0, 0],
// ];
