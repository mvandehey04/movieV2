public class TesterV3 { 
    public static void main(String args[]){ 
        // declare array of 10 movie objects
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("Scream", 1996, "Woods Entertainment");
        movies[1] = new Movie("Scream 2", 1997, "Dimension Films");
        movies[2] = new Movie("Scream 3", 2000, "Dimension Films");
        movies[3] = new Movie("Scream 5", 2022, "Paramount Pictures");
        movies[4] = new Movie("Texas Chainsaw Massacre", 2022, "Netflix");
        movies[5] = new Movie("The Conjuring", 2013, "Warner Bros. Pictures");
        movies[6] = new Movie("A Quiet Place", 2018, "Paramount Pictures");
        movies[7] = new Movie("A Quiet Place 2", 2020, "Paramount Pictures");
        movies[8] = new Movie("Sinister", 2012, "Summit Entertainment");
        movies[9] = new Movie("Halloween", 1978, "Compass International Pictures");

        // sorted movies
        Movie[] sorted = new Movie[10];

        print(movies);
        sortTitle(movies, sorted, 1);
        sortTitle(movies, sorted, 2);
        sortYear(movies, sorted, 1);
        sortYear(movies, sorted, 2);
        sortStudio(movies, sorted, 1);
        sortStudio(movies, sorted, 2);
    }

    public static void print(Movie[] movies){
        // traverse & print each element
        System.out.printf("%s %29s %8s \n", "Title", "Year", "Studio");
        System.out.println("------------------------------------------------------------------");
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i].toString());
        }
    }

    // parameters: array & int 
    // 1 sort ascend 2 sort descend
    public static void sortTitle(Movie[] source, Movie[] dest, int sort){
        String order = "";

        if(sort == 1) order = "ascending";
        if(sort == 2) order = "descending";

        System.out.println("\n <<Sorting by title in " + order + " order>> \n");

        // ascending order
        if(sort == 1){
            for( int i = 0 ; i < source.length ; i++ ){
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;

                while( k > 0 && insertIndex == 0 ){
                    if( next.getTitle().compareTo( dest[k-1].getTitle() ) > 0 ) insertIndex = k;
                    else dest[ k ] = dest[ k - 1 ];
                    k--;
                }

                dest[ insertIndex ] = next;
            }
        }

        // descending order
        else if(sort == 2){
            for( int i = 0 ; i < source.length ; i++ ){
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;

                while( k > 0 && insertIndex == 0 ){
                    if( next.getTitle().compareTo( dest[k-1].getTitle() ) < 0 ) insertIndex = k;
                    else dest[ k ] = dest[ k - 1 ];
                    k--;
                }

                dest[ insertIndex ] = next;
            }
        }
        
        print(dest);
        
    }

    public static void sortYear(Movie[] source, Movie[] dest, int sort){
        String order = "";

         if(sort == 1) order = "ascending";
         if(sort == 2) order = "descending";

        System.out.println("\n <<Sorting by year in " + order + " order>> \n");

        // ascending order
        if(sort == 1){
            for(int i = 0; i < source.length; i++){
                Movie next = source[i];
                int insertIndex = 0;
                int k = i;

                while(k > 0 && insertIndex == 0){
                    if(next.getYear() > dest[k - 1].getYear()) insertIndex = k;
                    else dest[ k ] = dest[ k - 1 ];
                    k--;
                }
    
                dest[ insertIndex ] = next;
            }
    
        }

        // descending order
        else if(sort == 2){
            for(int i = 0; i < source.length; i++){
                Movie next = source[i];
                int insertIndex = 0;
                int k = i;

                while(k > 0 && insertIndex == 0){
                    if(next.getYear() < dest[k - 1].getYear()) insertIndex = k;
                    else dest[ k ] = dest[ k - 1 ];
                    k--;
                }

                dest[ insertIndex ] = next;
            }
        }
        
        print(dest);
        
    }

    public static void sortStudio(Movie[] source, Movie[] dest, int sort){
        String order = "";

        if(sort == 1) order = "ascending";
        if(sort == 2) order = "descending";

        System.out.println("\n <<Sorting by studio in " + order + " order>> \n");

        // ascending order
        if(sort == 1){
            for( int i = 0 ; i < source.length ; i++ ){
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;

                while( k > 0 && insertIndex == 0 ){
                    if( next.getStudio().compareTo( dest[k-1].getStudio() ) > 0 ) insertIndex = k;
                    else dest[ k ] = dest[ k - 1 ];
                    k--;
                }

                dest[ insertIndex ] = next;
            }
        }

        // descending order
        else if(sort == 2){
            for( int i = 0 ; i < source.length ; i++ ){
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;

                while( k > 0 && insertIndex == 0 ){
                    if( next.getStudio().compareTo( dest[k-1].getStudio() ) < 0 ) insertIndex = k;
                    else dest[ k ] = dest[ k - 1 ];
                    k--;
                }

                dest[ insertIndex ] = next;
            }
        }
        
        print(dest);
    }

}
