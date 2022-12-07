let view_btn = document.getElementById("viewbtn");
let create_btn = document.getElementById("createbtn");
let update_btn = document.getElementById("updatebtn");
let delete_btn = document.getElementById("deletebtn");

view_btn.addEventListener("click", view_function);
create_btn.addEventListener("click", create_function);
update_btn.addEventListener("click", update_function);
delete_btn.addEventListener("click", delete_function);
function view_function() {
  const input_name = document.getElementById("name").value;
  const input_username = document.getElementById("username").value;
  const input_password = document.getElementById("password").value;
  console.log(input_username);
  console.log(input_password);
}
function create_function() {
  let MongoClient = require("mongodb").MongoClient;
  let url = "mongodb://localhost:27017/";

  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    let dbo = db.db("mydb");

    let myobj = {
      name: "Company Inc",
      address: "Highway 37",
    };

    dbo.collection("userInventory").insertOne(myobj, function (err, res) {
      if (err) throw err;
      console.log("1 document inserted");
      db.close();
    });
  });
}
function update_function() {
  const input_name = document.getElementById("name").value;
  const input_username = document.getElementById("username").value;
  const input_password = document.getElementById("password").value;
}
function delete_function() {
  const input_name = document.getElementById("name").value;
  const input_username = document.getElementById("username").value;
  const input_password = document.getElementById("password").value;
}
