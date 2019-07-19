let hello = require('./hello.js');
let calc = new hello.Calculator();
let _first = parseInt(process.argv[2] || '1');
let _second = parseInt(process.argv[3] || '1');
let operator = process.argv[4] || 'other';

calc._operation(operator,_first,_second);
