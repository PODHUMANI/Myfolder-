import UIKit

class ViewController: UIViewController {
    @IBOutlet weak var countLabel: UILabel!
    var count = 0

    @IBAction func increaseCount(_ sender: UIButton) {
        count += 1
        countLabel.text = "Count: \(count)"
    }
}
