import unittest
from cookiecutter.find import *


class TestFindTemplate(unittest.TestCase):
    def test_find_template(self):
        result = find_template("repo_dir")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()