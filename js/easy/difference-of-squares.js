export class Squares {
    /**
     * @param {number} limit
     */
    constructor(limit) {
        this.limit = limit;
    }

    get sumOfSquares() {
        let total = 0;

        for (let i = 1; i <= this.limit; i++) {
            total += i ** 2;
        }

        return total;
    }

    get squareOfSum() {
        let sum = 0;

        for (let i = 1; i <= this.limit; i++) {
            sum += i;
        }

        return sum ** 2;
    }

    get difference() {
        return this.squareOfSum - this.sumOfSquares;
    }
}

const first10 = new Squares(10);
console.log(first10.squareOfSum); // 3025
console.log(first10.sumOfSquares); // 385
console.log(first10.difference); // 2640
