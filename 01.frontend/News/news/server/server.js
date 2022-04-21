

const express = require('express');
const app = express();
const api = require('./routes/index');//

const cors = require('cors');
app.use(cors());//

app.use('/api',api);

//  app.use('/', (req, res) => {
//     res.json({username:'유저 명'});
// });
 app.listen(3003, function () {
    console.log(`listening on port 3003!`);
 });

