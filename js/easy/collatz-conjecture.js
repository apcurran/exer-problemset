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
 * solution 2 -- recursion
 * time: O(log n)
 * space: O(log n)
 *
 * @param {number} num
 * @returns {number}
 */
export const steps = (num, count = 0) => {
    if (num <= 0) {
        throw new Error("Only positive integers are allowed");
    }

    if (num === 1) {
        return count;
    }

    if (num % 2 === 0) {
        return steps(num / 2, count + 1);
    } else {
        return steps(num * 3 + 1, count + 1);
    }
};

console.log(steps(1)); // 0
console.log(steps(12)); // 9
console.log(steps(0)); // Error
