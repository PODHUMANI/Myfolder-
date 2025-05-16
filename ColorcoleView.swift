import UIKit

// Step 1: Model
struct ColorItem: Codable {
    let id: Int
    let name: String
    let year: Int
    let color: String
    let pantone_value: String
}

// Step 2: ViewController
class ColorViewController: UICollectionViewController, UICollectionViewDelegateFlowLayout {

    var colorList: [ColorItem] = []

    override func viewDidLoad() {
        super.viewDidLoad()
        self.title = "Colors"
        self.collectionView.backgroundColor = .systemBackground

        if let layout = collectionViewLayout as? UICollectionViewFlowLayout {
            layout.headerReferenceSize = CGSize(width: view.bounds.width, height: 40)
        }

        // Register header view
        collectionView.register(UICollectionReusableView.self,
                                forSupplementaryViewOfKind: UICollectionView.elementKindSectionHeader,
                                withReuseIdentifier: "Header")

        colorList = loadFromPlist()
    }

    func loadFromPlist() -> [ColorItem] {
        guard let url = Bundle.main.url(forResource: "PListTable", withExtension: "plist"),
              let data = try? Data(contentsOf: url) else { return [] }

        do {
            let decoder = PropertyListDecoder()
            return try decoder.decode([ColorItem].self, from: data)
        } catch {
            print("Decode Error:
