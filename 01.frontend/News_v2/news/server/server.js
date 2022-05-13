const express = require('express');
const app = express();
const api = require('./routes/index');

const cors = require('cors');
app.use(cors());

app.use('/api',api);


app.listen(3001, function () {
   console.log(`listening on port 3001!`);
});