public class Main {
    public static void main(String[] args)
    {
        Maze maze = new Maze(10);
        maze.generate();
        char[][] initialMaze = maze.getBorderedMaze();
        printMaze(initialMaze);

        System.out.println();

        maze.solve();
        char[][] solvedMaze = maze.getBorderedMaze();
        printMaze(solvedMaze);
    }

    private static void printMaze(char[][] maze)
    {
        for(int i = 0; i < maze.length; ++i)
        {
            for(int j = 0; j < maze[0].length; ++j)
            {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
}