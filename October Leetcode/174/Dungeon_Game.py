class Solution:
    def calculateMinimumHP(self, dungeon: List[List[int]]) -> int:
        # perhaps we can solve this problem reverse
        if len(dungeon)<1 or len(dungeon[0])<1:
            return 0
        h=len(dungeon)
        w=len(dungeon[0])
        dungeon[-1][-1]=max(1,1-dungeon[-1][-1])
        for x in range(w-2,-1,-1):
            dungeon[-1][x]=max(1,dungeon[-1][x+1]-dungeon[-1][x])
        for y in range(h-2,-1,-1):
            dungeon[y][-1]=max(1,dungeon[y+1][-1]-dungeon[y][-1])
        for y in range(h-2,-1,-1):
            for x in range(w-2,-1,-1):
                right=max(1,dungeon[y][x+1]-dungeon[y][x])
                down=max(1,dungeon[y+1][x]-dungeon[y][x])
                dungeon[y][x]=min(right,down)
        return dungeon[0][0]
        
