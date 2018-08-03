const encode = (toEncode) => {
    if (!toEncode) {
        return toEncode;
    } else {
        let final = '';
        let last = '';
        let count = 0;
        let letters = toEncode.split('');
        // console.log(letters);
        for (let i = 0; i < letters.length; i++) {
            // console.log(letters[i]);
            if (i === 0) {
                last = letters[i];
                count += 1;
            }  else if (i === letters.length - 1) {
                if (letters[i] === last) {
                    count += 1;
                    if (count > 1) {
                        final += `${count}${last}`;
                    } else {
                        final += `${last}${letters[i]}`;
                    }
                } else {
                    if (count > 1) {
                        final += `${count}${last}${letters[i]}`;
                    } else {
                        final += `${last}${letters[i]}`;
                    }
                }
            } else if (letters[i] === last) {
                count += 1;
            } else {
                if (count > 1) {
                    final += `${count}${last}`;
                } else {
                    final += `${last}`;
                }
                count = 1;
                last = letters[i]
            }
        }
        // console.log(final);
        return final;
    }
};

const decode = (toDecode) => {
    console.log(toDecode.split(/\d+/));
    return toDecode;
};

export { encode, decode };
