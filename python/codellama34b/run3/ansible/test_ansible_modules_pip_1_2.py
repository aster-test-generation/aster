from ansible.modules.pip import _is_vcs_url
import unittest
from ansible.modules.pip import *



class TestPipModule(unittest.TestCase):
    def test_is_vcs_url(self):
        result = _is_vcs_url("svn+")
        self.assertEqual(result, True)

    def test_is_vcs_url_false(self):
        result = _is_vcs_url("git+")
        self.assertEqual(result, False)

    def test_is_vcs_url_false_2(self):
        result = _is_vcs_url("hg+")
        self.assertEqual(result, False)

    def test_is_vcs_url_false_3(self):
        result = _is_vcs_url("bzr+")
        self.assertEqual(result, False)

    def test_is_vcs_url_false_4(self):
        result = _is_vcs_url("svn")
        self.assertEqual(result, False)

    def test_is_vcs_url_false_5(self):
        result = _is_vcs_url("git")
        self.assertEqual(result, False)

    def test_is_vcs_url_false_6(self):
        result = _is_vcs_url("hg")
        self.assertEqual(result, False)

    def test_is_vcs_url_false_7(self):
        result = _is_vcs_url("bzr")
        self.assertEqual(result, False)

    def test_is_vcs_url_false_8(self):
        result = _is_vcs_url("svn+http://example.com/path/to/repo.git")
        self.assertEqual(result, True)

    def test_is_vcs_url_false_9(self):
        result = _is_vcs_url("git+http://example.com/path/to/repo.git")
        self.assertEqual(result, True)

    def test_is_vcs_url_false_10(self):
        result = _is_vcs_url("hg+http://example.com/path/to/repo.git")
        self.assertEqual(result, True)

    def test_is_vcs_url_false_11(self):
        result = _is_vcs_url("bzr+http://example.com/path/to/repo.git")
        self.assertEqual(result, True)

    def test_is_vcs_url_false_12(self):
        result = _is_vcs_url("svn+http://example.com/path/to/repo.git#egg=example")
        self.assertEqual(result, True)

    def test_is_vcs_url_false_13(self):
        result = _is_vcs_url("git+http://example.com/path/to/repo.git#egg=example")
        self.assertEqual(result, True)

    def test_is_vcs_url_false_14(self):
        result = _is_vcs_url("hg+http://example.com/path/to/repo.git#egg=example")
        self.assertEqual(result, True)

    def test_is_vcs_url_false_15(self):
        result = _is_vcs_url("bzr+http://example.com/path/to/repo.git#egg=example")
        self.assertEqual(result, True)

    def test_is_vcs_url_false_16(self):
        result = _is_vcs_url("svn+http://example.com/path/to/repo.git#egg=example&subdirectory=subdir")
        self.assertEqual(result, True)

    def test_is_vcs_url_false_17(self):
        result = _is_vcs_url("git+http://example.com/path/to/repo.git#egg=example&subdirectory=subdir")
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()