/**
 * @Author John Antonio Collins
 * Created on 6/2/17.
 */
public class Algorithm
{

    //IronMan problem from Chatham test
    public int powerLevel(int[] p)
    {
        //PLAN: work out dynamic algorithm based on separate counter, and elements before and after.
        int mP = 0;//mP = minimumPower , return value.
        int cP = 0;//cP = currentPower , running sum.

        //if current power is less than current element, add the difference to mP, add the difference to cP.
        //another way to say that is:
        //cP += p[i];
        //if(cP < 0){mP += cP*-1; cP = 0;}

        //ATTEMPT 1: start from beginning and use above algorithm.
        for(int i = 0; i < p.length; i++){
            cP += p[i];
            if(cP < 0){
                mP += cP*-1;
                cP = 0;
            }
        }
        return mP;
    }
}
