const toRoman = (num) => {
    let roman = [
        ['M', 1000],
        ['CM', 900],
        ['D', 500],
        ['CD', 400],
        ['C', 100],
        ['XC', 90],
        ['L', 50],
        ['XL', 40],
        ['X', 10],
        ['IX', 9],
        ['V', 5],
        ['IV', 4],
        ['I', 1],
    ];
    let solution = '';
    for (let i in roman) {

        // I like this solution better
        while (num >= roman[i][1]) {
            num -= roman[i][1];
            solution += roman[i][0];
        }

        // Second way of solving
        // let d = Math.floor(num / roman[i][1]);
        // num -= d * roman[i][1];
        // solution += roman[i][0].repeat(d);
    }
    return solution;
};

export default toRoman;
