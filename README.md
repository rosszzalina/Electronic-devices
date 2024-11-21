# Electronic Devices Manager

This project is a JavaFX application for managing electronic devices, including Smartphones, Tablets, and Laptops. It uses JavaFX for the user interface and supports adding, displaying, and removing devices.

## Features
- **Tabs for device categories:** Separate tabs for Smartphones, Tablets, and Laptops.
- **Input fields:** Add device details such as name, price, weight, and specific attributes (e.g., screen size for Smartphones, battery life for Tablets).
- **List view:** Display the list of added devices.
- **Remove functionality:** Delete selected devices from the list.
- **Responsive design:** User-friendly layout with clean spacing and alignment.

## How It Works
1. **Device Tabs:** 
   - Each tab corresponds to a device type with its specific input fields.
   - Example:
     - Smartphone: Name, Price, Weight, Screen Size, Camera Resolution.
     - Tablet: Name, Price, Weight, Battery Life, Stylus option.
     - Laptop: Name, Price, Weight, Processor Type, RAM Size.
2. **List View Tab:**
   - Displays all added devices.
   - Allows selection and removal of devices.

3. **FXML Layout:**
   - The user interface is defined in the `hello-view.fxml` file, designed using JavaFX Scene Builder.

## Files
- **MainApplication.java:** Entry point of the JavaFX application.
- **DeviceManagerController.java:** Handles the UI interactions (button clicks, data processing).
- **FXML (hello-view.fxml):** Defines the structure and layout of the user interface.
- **Model Classes:** `Smartphone`, `Tablet`, and `Laptop` extend the base `Device` class.

## How to Run
1. Clone the repository:
   ```bash
   git clone <repository-url>
# Screenshots:
![Screenshot (28)](https://github.com/user-attachments/assets/4316c261-f8ef-4811-ac63-f6028ac62983)


![Screenshot (27)](https://github.com/user-attachments/assets/28bd4bd5-ba99-42f8-83ba-1a3b1ae8f396)

