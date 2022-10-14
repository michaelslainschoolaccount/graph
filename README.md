# Graph

## Info

Author: Michael Slain <br>
Acknowledgements: Mr. Kuszmaul

## Classes Outline

### Graph

**Methods**

-   _constructor_
    -   **input:** A set of nodes, a set of edges
    -   **output:** nothing
    -   **effect:** Adds the nodes and edges provided
-   children
    -   **input:** A node
    -   **output:** The children of the graph
    -   **effect:** Gets the children of the graph
-   toString
    -   **input:** nothing
    -   **ouput:** nothing
    -   **effect** Converts the graph into a string representation

### Node

**Methods**

-   _constructor_
    -   **input:** A number
    -   **output:** nothing
    -   **effect:** Sets the id of the node to the number provided
-   toString
    -   **input:** nothing
    -   **output:** nothing
    -   **effect:** Prints the id of the node

### Edge

**Methods**

-   _constructor_
    -   **input:** Starting node, ending node
    -   **output:** nothing
    -   **effect:** Sets it's starting and ending node to the nodes
        provided
-   getStart
    -   **input:** nothing
    -   **output:** A node
    -   **effect:** Gets the start node
-   getEnd
    -   **input:** nothing
    -   **output:** A node
    -   **effect:** Gets the end node of the edge
-   setStart
    -   **input:** A node
    -   **output:** nothing
    -   **effect:** Sets the start node of the edge
-   setEnd
    -   **input:** A node
    -   **output:** nothing
    -   **effect:** Sets the end node of the edge
-   toString
    -   **input:** nothing
    -   **output:** nothing
    -   **effect:** Prints the start and end node of the edge
