import csv
import secrets
from ff3 import FF3Cipher

def encrypt_card_number(card_number):
    """Encrypts a credit card number using FF3 cipher with a random key."""
    card_number = card_number.replace(" ", "")  # Remove spaces
    key = secrets.token_hex(16)  # Generate random key
    tweak = "D8E7920AFA330A73"
    cipher = FF3Cipher(key, tweak)
    encrypted_card_number = cipher.encrypt(str(card_number))
    # Add spaces back for readability
    encrypted_card_number = ' '.join(encrypted_card_number[i:i+4] for i in range(0, len(encrypted_card_number), 4))
    return encrypted_card_number, key

def import_and_encrypt_data(input_file, output_file):
    """Imports data from a CSV file, encrypts card numbers, and saves to a new CSV."""
    try:
        with open(input_file, 'r', newline='') as csvfile, open(output_file, 'w', newline='') as new_csvfile:
            reader = csv.reader(csvfile)
            writer = csv.writer(new_csvfile)

            # Write header row
            header_row = next(reader)  # Assuming header row exists
            header_row.append("Encrypted Card Number")
            header_row.append("Key")
            writer.writerow(header_row)

            for row in reader:
                name, card_number, expiry, cvv = row
                encrypted_card_number, key = encrypt_card_number(card_number)
                new_row = [name, card_number, expiry, cvv, encrypted_card_number, key]
                writer.writerow(new_row)

        print(f"Data imported and encrypted successfully! Saved to: {output_file}")
    except FileNotFoundError as e:
        print(f"Error: {e}")

if __name__ == "__main__":
    input_file = "data.csv"  # Replace with your actual CSV file path
    output_file = "data1.csv"  # Specify the output file path

    import_and_encrypt_data(input_file, output_file)


