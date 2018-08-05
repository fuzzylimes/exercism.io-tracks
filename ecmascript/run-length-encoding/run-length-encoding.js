const encode = (toEncode) => {
    if (!toEncode) {
        return toEncode;
    } else {
        let encode = '';
        let matches = toEncode.match(/(.)\1*/g);
        for (let i of matches) {
            if (i.length > 1) {
                encode += `${i.length}`;
            }
            encode += `${i[0]}`;
        }
        return encode;
    }
};

const decode = (toDecode) => {
    if (!toDecode) {
        return toDecode;
    }
    let myRegex = /(\d*)(\D)/g;
    let decode = '';
    let match;

    while (match = myRegex.exec(toDecode)) {
        if (match[1]) {
            for (let j = parseInt(match[1]); j > 0; j--) {
                decode += match[2];
            }
        } else {
            decode += match[2];
        }
    }
    return decode;
};

export { encode, decode };
