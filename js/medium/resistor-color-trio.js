export class ResistorColorTrio {
    /**
     * @param {string} colors
     */
    constructor(colors) {
        this.colors = colors;
        this.COLOR_BANDS = [
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white",
        ];
    }

    /**
     * @returns {string}
     */
    get label() {
        let numStr = "";

        for (let i = 0; i < 2; i++) {
            const color = this.colors[i];
            const colorIndex = this.COLOR_BANDS.indexOf(color);

            if (colorIndex === -1) {
                throw new Error("invalid color");
            }

            numStr += colorIndex;
        }

        const zerosCount = this.COLOR_BANDS.indexOf(this.colors[2]);

        if (zerosCount === -1) {
            throw new Error("invalid color");
        }

        numStr = numStr.padEnd(zerosCount + 2, "0");
        let num = Number(numStr);
        let ohmPrefix = "";

        if (num >= 1_000_000_000) {
            num /= 1_000_000_000;
            ohmPrefix = "giga";
        } else if (num >= 1_000_000) {
            num /= 1_000_000;
            ohmPrefix = "mega";
        } else if (num >= 1_000) {
            num /= 1_000;
            ohmPrefix = "kilo";
        }

        return `Resistor value: ${num} ${ohmPrefix}ohms`;
    }
}

console.log(new ResistorColorTrio(["orange", "orange", "black"]).label); // 33 ohms
console.log(new ResistorColorTrio(["blue", "grey", "brown"]).label); // 680 ohms
console.log(new ResistorColorTrio(["red", "black", "red"]).label); // 2 kiloohms
console.log(new ResistorColorTrio(["green", "brown", "orange"]).label); // 51 kiloohms
console.log(new ResistorColorTrio(["yellow", "violet", "yellow"]).label); // 470 kiloohms
console.log(new ResistorColorTrio(["blue", "green", "yellow"]).label); // 650 kiloohms
console.log(new ResistorColorTrio(["blue", "green", "green"]).label); // 6.5 megaohms
console.log(new ResistorColorTrio(["orange", "orange", "blue"]).label); // 33 megaohms
console.log(new ResistorColorTrio(["white", "white", "violet"]).label); // 990 megaohms
console.log(new ResistorColorTrio(["brown", "black", "white"]).label); // 10 gigaohms
console.log(new ResistorColorTrio(["blue", "grey", "white"]).label); // 68 gigaohms
