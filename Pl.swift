671

7

8 import UIKit
m class ViewController: UIViewController {
 var mytitle= [String]()

override func viewDidLoad() {

super.viewDidLoad()

// Do any additional setup after loading the view.

print("test")

if let path Bundle.main.path(forResource: "Books", ofType: "plist") {

let dictionary NSDictionary(contentsOfFile: path)

if let mydict dictionary as? [String: Any] {

if let mydata = mydict["results"] as? [Any] {

print(mydata)

for index in mydata {

if let value index as? [String:Any] {

self.mytitle.append(value["title"] as? String ?? "test")

// self.mytitle.append(value["authors"] as? [String: Any])
}
}
}
}
// self.mytableview.reload()

36

}
print(mytitle)
print("testing")
}
