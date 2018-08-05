const encode = (toEncode) => {
    if (!toEncode) {
        return toEncode;
    } else {
        // let final = '';
        // let last = '';
        // let count = 0;
        // let letters = toEncode.split('');
        // // console.log(letters);
        // for (let i = 0; i < letters.length; i++) {
        //     // console.log(letters[i]);
        //     if (i === 0) {
        //         last = letters[i];
        //         count += 1;
        //     }  else if (i === letters.length - 1) {
        //         if (letters[i] === last) {
        //             count += 1;
        //             if (count > 1) {
        //                 final += `${count}${last}`;
        //             } else {
        //                 final += `${last}${letters[i]}`;
        //             }
        //         } else {
        //             if (count > 1) {
        //                 final += `${count}${last}${letters[i]}`;
        //             } else {
        //                 final += `${last}${letters[i]}`;
        //             }
        //         }
        //     } else if (letters[i] === last) {
        //         count += 1;
        //     } else {
        //         if (count > 1) {
        //             final += `${count}${last}`;
        //         } else {
        //             final += `${last}`;
        //         }
        //         count = 1;
        //         last = letters[i]
        //     }
        // }
        // console.log(final);
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
    //let list = toDecode.match(/\d*\D/g);
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

    // console.log(list);
    // for (let i of list) {
    //     let a = myRegex.exec(i);
    //     console.log(a);
    //     if (a.length > 2) {
    //         for (let j = parseInt(a[1]); j > 0; j--) {
    //             decode += a[2];
    //         }
    //     } else {
    //         decode += a[1];
    //     }
    // }


    // for (let i of list) {
    //     if (i.length > 1) {
    //         decode += `${i.length}`;
    //     }
    //     decode += `${i[0]}`;
    // }
    // return decode;
    return decode;
};

export { encode, decode };
