export class Triangle {
    /**
     * @param  {...number} sides
     */
    constructor(...sides) {
        const [a, b, c] = sides;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    get isTriangle() {
        const { a, b, c } = this;

        return a > 0 && b > 0 && c > 0 && a + b >= c && b + c >= a && a + c >= b;
    }

    //An equilateral triangle has all three sides the same length.
    get isEquilateral() {
        if (!this.isTriangle) {
            return false;
        }

        return this.a === this.b && this.b === this.c;
    }

    // An isosceles triangle has at least two sides the same length.
    get isIsosceles() {
        if (!this.isTriangle) {
            return false;
        }

        return this.a === this.b || this.a === this.c || this.b === this.c;
    }

    // A scalene triangle has all sides of different lengths.
    get isScalene() {
        if (!this.isTriangle) {
            return false;
        }

        return this.a !== this.b && this.b !== this.c && this.a !== this.c;
    }
}
