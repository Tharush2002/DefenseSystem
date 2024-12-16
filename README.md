# Defense System Project

This project simulates a defense system that manages and monitors various defense units, such as Helicopters, Tanks, and Submarines. The system features graphical user interfaces (GUIs) for each defense unit and leverages a centralized controller for communication and coordination.

## Features

- **Defense Units:** Simulate Helicopters, Tanks, and Submarines with unique characteristics.
- **Centralized Control:** MainController acts as a mediator for coordination and communication.
- **Observer Pattern:** Real-time updates on defense units' statuses and interactions.
- **GUI Visualization:** User-friendly interfaces to control and monitor each defense unit.
- **Scalability:** Easily extendable to add more defense units or functionalities.

## Components

### 1. Helicopter
- **Characteristics:** Aerial capabilities with mobility and firepower.
- **User Actions:** Shoot, missile operations, and laser operations.
- **Integration:** Communicates with the MainController about area messages, war strength, and updates.

### 2. Tank
- **Characteristics:** Ground-based operations with heavy firepower and durability.
- **User Actions:** Shoot and other tank-specific operations.
- **Integration:** Reports area messages and war strength to the MainController.

### 3. Submarine
- **Characteristics:** Specialized for underwater missions with sonar and missile capabilities.
- **User Actions:** Underwater shooting, missile deployment, and sonar operations.
- **Integration:** Sends area updates and strength signals to the MainController.

### 4. MainController
- **Role:** Central coordinator managing interactions and broadcasting updates.
- **Features:** Strength calculation, global operations handling, and area message exchanges.

### 5. Strength Enum
- Represents different strength levels (LOW, MEDIUM, HIGH, STRONG, CLOSED).

### 6. Starter Class
- Initializes the observer and MainController.
- Creates instances of Helicopter, Tank, and Submarine and links them to the observer.

## Technologies Used
- **Programming Language:** Java
- **IDE:** NetBeans (Recommended for opening and running the project)
- **Design Patterns:** Observer Pattern
- **Libraries/Frameworks:** Java Swing for GUI

## Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Tharush2002/DefenseSystem.git
   ```
2. **Open in NetBeans:**
   - Open NetBeans IDE.
   - Navigate to `File -> Open Project` and select the cloned repository.
3. **Build and Run:**
   - Clean and build the project.
   - Run the application to simulate the defense system.

## Usage

1. **Interact with Defense Units:**
   - Use the GUI to control Helicopters, Tanks, and Submarines.
   - Perform actions like shooting, sending messages, or updating attributes.
2. **Monitor Centralized Updates:**
   - Observe real-time updates via the MainController.

## Real-World Applications
This project demonstrates centralized control in defense systems and can be extended to real-world scenarios requiring coordination among various units.

## Contribution
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch (`feature/your-feature-name`).
3. Commit your changes.
4. Submit a pull request.

---

For any issues or queries, feel free to raise an issue or contact me.
