var german = require("german");

exports.hello = function(name) {
    return german.hello() + ", " + name;
};
