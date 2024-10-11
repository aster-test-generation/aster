import unittest
from ansible.plugins.filter.core import *


class TestCore(unittest.TestCase):
    def test_mandatory(self):
        self.assertEqual(mandatory(1), 1)
        self.assertEqual(mandatory(None), None)
        with self.assertRaises(AnsibleFilterError):
            mandatory(AnsibleUndefined())
        with self.assertRaises(AnsibleFilterError):
            mandatory(AnsibleUndefined(), msg="Mandatory variable not defined.")

    def test_combine(self):
        self.assertEqual(combine(), {})
        self.assertEqual(combine(1), 1)
        self.assertEqual(combine(1, 2), {'1': 1, '2': 2})
        self.assertEqual(combine(1, 2, recursive=True), 2)
        self.assertEqual(combine(1, 2, list_merge="replace"), 2)
        self.assertEqual(combine(1, 2, list_merge="merge"), 2)
        self.assertEqual(combine(1, 2, list_merge="append"), 2)
        self.assertEqual(combine(1, 2, list_merge="prepend"), 2)
        self.assertEqual(combine(1, 2, list_merge="error"), 2)

    def test_comment(self):
        self.assertEqual(comment("text"), "#\n# text\n#")
        self.assertEqual(comment("text", style="plain"), "text")
        self.assertEqual(comment("text", style="plain", decoration="###"), "###text")
        self.assertEqual(comment("text", style="plain", decoration="###", prefix="##"), "##text")
        self.assertEqual(comment("text", style="plain", decoration="###", prefix="##", prefix_count=2), "##text")
        self.assertEqual(comment("text", style="plain", decoration="###", prefix="##", prefix_count=2, postfix="##"), "##text")
        self.assertEqual(comment("text", style="plain", decoration="###", prefix="##", prefix_count=2, postfix="##", postfix_count=2), "##text")
        self.assertEqual(comment("text", style="plain", decoration="###", prefix="##", prefix_count=2, postfix="##", postfix_count=2, end="###"), "##text")

    def test_extract(self):
        self.assertEqual(extract(1, 2, 3), [1, 2])
        self.assertEqual(extract(1, 2, 3, 4), 3)
        self.assertEqual(extract(1, 2, 3, 4, 5), 3)

    def test_groupby(self):
        self.assertEqual(groupby(1, 2), 3)
        self.assertEqual(groupby(1, 2, 3), 3)
        self.assertEqual(groupby(1, 2, 3, 4), 4)

    def test_b64encode(self):
        self.assertEqual(b64encode("string"), "c3RyaW5n")
        self.assertEqual(b64encode("string", encoding="utf-8"), "c3RyaW5n")

    def test_b64decode(self):
        self.assertEqual(b64decode("c3RyaW5n"), "string")
        self.assertEqual(b64decode("c3RyaW5n", encoding="utf-8"), "string")

if __name__ == '__main__':
    unittest.main()