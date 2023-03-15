const express = require('express')
const app = express()

app.use(express.json())
app.use(express.urlencoded({ extended: false }))
//app.use(express.static("public"))


app.get("/", (req, res) => {
    res.sendFile("/home/nk/java/nodejs/internetdata/simple1.html")
})

//const port = process.env.PORT || 5000
const port = 5000
app.listen(port, () => {
    console.log(`Server Up in Port ${port}`);
})
