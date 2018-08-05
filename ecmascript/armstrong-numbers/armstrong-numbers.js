const armstrong = {
    validate: (num) => {
        let digits = num.toString().split('');
        let exp = digits.length;
        let total = 0;
        for (let i of digits) {
            total += parseInt(i) ** exp;
        }
        return (total === num);
    },
};

export default armstrong;
