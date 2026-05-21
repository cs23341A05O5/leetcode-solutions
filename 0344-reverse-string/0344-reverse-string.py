class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None
        """

        s[:] = s[::-1]