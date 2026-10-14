export class Matrix {
    #rows;

    /** @param {string} matrix  */
    constructor(matrix) {
        this.#rows = matrix.split("\n").map(function convertToRows(row) {
            return row.split(" ").map(Number);
        });
    }

    get rows() {
        return this.#rows;
    }

    get columns() {
        return this.#rows[0].map((_, col) => this.#rows.map((row) => row[col]));
    }
}

// matrix
// '1 2 3\n4 5 6\n7 8 9\n8 7 6'
