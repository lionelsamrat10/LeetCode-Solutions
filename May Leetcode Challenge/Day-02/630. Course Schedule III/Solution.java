class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b) -> {
            return a[1] - b[1];
        });
        
        int time = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b) -> {
           return b-a; 
        });
        
        for(int i=0; i<courses.length; i++)
        {
            if(time+courses[i][0] <= courses[i][1])
            {
                time += courses[i][0];
                queue.offer(courses[i][0]);
            }
            else
            {
                if(!queue.isEmpty() && queue.peek() > courses[i][0]) 
                {
                    time = time - queue.poll()+courses[i][0];
                    queue.offer(courses[i][0]);
                }
            }
        }
        
        return queue.size();
    }
}
