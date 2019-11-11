import collections

class Solution:
    def fourSum(self, nums, target):
        pairs = collections.defaultdict(list)
        # print(pairs)

        l = len(nums)

        for i in range(l):
            for j in range(i+1, l):
                pairs[nums[i] + nums[j]].append((i,j))

        # print(pairs)
        res = set()

        for s, ps in pairs.items():
            for a , b in ps:
                if target-s in pairs:
                    for k, v in pairs[target-s]:
                        if a != k and a != v and b != k and b != v:
                            res.add(tuple(sorted([nums[i] for i in [a,b,k,v]])))

        return res

res = Solution()

nums = [1, 0, -1, 0, -2, 2]
target = 0

print(res.fourSum(nums, target))

