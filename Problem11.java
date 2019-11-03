import java.util.Scanner;

class PhysicalExcercise2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            Point sharechatPoint=new Point(sc.nextInt(), sc.nextInt());
            int n=sc.nextInt();
            Point [] nPoints=new Point[n];
            int m=sc.nextInt();
            Point [] mPoints=new Point[m];
            int k=sc.nextInt();
            Point [] kPoints=new Point[k];
            for(int j=0;j<n;j++){
                nPoints[j]=new Point(sc.nextInt(), sc.nextInt());
            }
            for(int j=0;j<m;j++){
                mPoints[j]=new Point(sc.nextInt(), sc.nextInt());
            }
            for(int j=0;j<k;j++){
                kPoints[j]=new Point(sc.nextInt(), sc.nextInt());
            }
            double ans=0.0;
            boolean isIntialised=false;
            for(int x=0;x<n;x++){
                double dist1=distanceBetweenTwoPoints(sharechatPoint, nPoints[x]);
                if(isIntialised && dist1>ans){
                    continue;
                }
                for(int y=0;y<m;y++){
                    double dist2=distanceBetweenTwoPoints(nPoints[x], mPoints[y]);
                    if(isIntialised && dist1+dist2>ans){
                        continue;
                    }
                    for(int z=0;z<k;z++){
                        double dist3=distanceBetweenTwoPoints(mPoints[y], kPoints[z]);
                        if(!isIntialised){
                            ans=dist1+dist2+dist3;
                            isIntialised=true;
                        }else if(dist1+dist2+dist3<ans){
                            ans=dist1+dist2+dist3;
                        }
                    }
                }
            }
            for(int x=0;x<m;x++){
                double dist1=distanceBetweenTwoPoints(sharechatPoint, mPoints[x]);
                if(dist1>ans){
                    continue;
                }
                for(int y=0;y<n;y++){
                    double dist2=distanceBetweenTwoPoints(mPoints[x], nPoints[y]);
                    if(dist1+dist2>ans){
                        continue;
                    }
                    for(int z=0;z<k;z++){
                        double dist3=distanceBetweenTwoPoints(nPoints[y], kPoints[z]);
                        
                        if(dist1+dist2+dist3<ans){
                            ans=dist1+dist2+dist3;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
    static double distanceBetweenTwoPoints(Point p1, Point p2){
        double sq1=Math.pow((p2.x-p1.x),2);
        double sq2=Math.pow((p2.y-p1.y),2);
        return Math.sqrt(sq1+sq2);
    }
    
}
class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
