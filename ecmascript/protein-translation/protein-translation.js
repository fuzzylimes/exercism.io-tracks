const map = {
    'AUG': 'Methionine',
    'UUU': 'Phenylalanine',
    'UUC': 'Phenylalanine',
    'UUA': 'Leucine',
    'UUG': 'Leucine',
    'UCU': 'Serine',
    'UCC': 'Serine',
    'UCA': 'Serine',
    'UCG': 'Serine',
    'UAU': 'Tyrosine',
    'UAC': 'Tyrosine',
    'UGU': 'Cysteine',
    'UGC': 'Cysteine',
    'UGG': 'Tryptophan',
    'UAA': 'STOP',
    'UAG': 'STOP',
    'UGA': 'STOP',
}

const translate = (code) => {
    let proteins = [];
    if (!code) {
        return proteins;
    }
    let chain = code.match(/.{1,3}/g);

    // I originally tried to do this with a forEach loop, but found I
    // got stuck as return didn't exit the loop.
    for (let e of chain) {
        let a = map[e];
        if (a === undefined) {

            // Good to know throw will break as well.
            // Added extra test for this case.
            throw 'Invalid codon';
        }
        if (a === 'STOP') {
            break;
        } else {
            proteins.push(a);
        }
    }
    return proteins;
};

export default translate;
