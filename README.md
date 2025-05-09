# MovieShowTime

A simple Java program that reads movie showtimes from a CSV file and displays formatted listings by title, rating, and time. This project demonstrates file input, collection handling with `LinkedList` and `LinkedHashSet`, and structured console output formatting.

---

## Project Structure

```
MovieShowTime/
├── src/
│   └── MovieTimes.java         # Reads and formats movie data from CSV
├── movies.csv                  # Input file containing showtime, title, and rating per row
└──
```

---

## Core Java Classes

### `MovieTimes.java`
- Prompts the user to enter the path to a `.csv` file
- Reads movie data into a `LinkedList` and extracts unique titles using a `LinkedHashSet`
- Groups and prints movie listings by:
  - **Title** (aligned left, max 44 characters)
  - **Rating** (right-aligned, fixed width)
  - **Showtimes** (grouped by movie)

---

## Input File Format

The `movies.csv` file should contain lines formatted like:
```
5:00PM,The Batman,PG-13
6:30PM,The Batman,PG-13
7:00PM,Encanto,PG
```

Each row must follow this order:
```
Showtime,Title,Rating
```

---

## How to Run

1. Ensure you have `Java SE 17` installed.
2. Place your `movies.csv` file in the project directory or provide the full path when prompted.
3. Compile and run:
```bash
javac src/MovieTimes.java
java -cp src MovieTimes
```
4. When prompted, enter:
```
movies.csv
```

---

## Future Enhancements
- Add support for sorting movies by time or title
- Handle duplicate rating mismatches gracefully
- Support loading files via GUI or drag-and-drop interface

---

## License
This project is licensed for personal, non-commercial use only. Redistribution, resale, or modification is prohibited without written permission from the author.  
See the [LICENSE] file for full details.

---

## Author  
**Trace Davis**  
- GitHub: [Trace0727](https://github.com/Trace0727)  
- LinkedIn: [Trace Davis](https://www.linkedin.com/in/trace-d-926380138/)
