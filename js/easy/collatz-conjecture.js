// /**
//  * solution 1
//  * time: O(log n)
//  * space: O(1)
//  * @param {number} num
//  * @returns {number}
//  */
// export const steps = (num) => {
//     if (num <= 0) {
//         throw new Error("Only positive integers are allowed");
//     }

//     let count = 0;

//     while (num !== 1) {
//         if (num % 2 === 0) {
//             // if even
//             num /= 2;
//             count++;
//         } else {
//             // if odd
//             num = num * 3 + 1;
//             count++;
//         }
//     }

//     return count;
// };

/**
 *
 * @param {number} num
 * @returns {number}
 */
export const steps = (num) => {
    if (num <= 0) {
        throw new Error("Only positive integers are allowed");
    }

    let count = 0;

    while (num !== 1) {
        if (num % 2 === 0) {
            // if even
            num /= 2;
            count++;
        } else {
            // if odd
            num = num * 3 + 1;
            count++;
        }
    }

    return count;
};

console.log(steps(1)); // 0
console.log(steps(12)); // 9
console.log(steps(0)); // Error
