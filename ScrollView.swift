import UIKit

class ViewController: UIViewController {
    @IBOutlet var ScrollViewOne: UIScrollView!

    let gradientLayer = CAGradientLayer()

    override func viewDidLoad() {
        super.viewDidLoad()
        setupGradientLayer()
    }

    override func viewDidLayoutSubviews() {
        super.viewDidLayoutSubviews()
        // Set gradient frame after layout
        gradientLayer.frame = ScrollViewOne.bounds
    }

    func setupGradientLayer() {
        gradientLayer.colors = [UIColor.red.cgColor, UIColor.blue.cgColor]
        gradientLayer.startPoint = CGPoint(x: 0.5, y: 0)
        gradientLayer.endPoint = CGPoint(x: 0.5, y: 1)

        let backgroundView = UIView()
        backgroundView.frame = ScrollViewOne.bounds
        backgroundView.layer.insertSublayer(gradientLayer, at: 0)

        ScrollViewOne.insertSubview(backgroundView, at: 0)
    }
}
