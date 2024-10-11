import unittest
from ansible.modules.pip import *



class TestPipModule(unittest.TestCase):
    def test_is_vcs_url(self):
        result = _is_vcs_url("svn+")
        self.assertEqual(result, True)

    def test_is_vcs_url(self):
        result = _is_vcs_url("git+")
        self.assertEqual(result, True)

    def test_is_vcs_url(self):
        result = _is_vcs_url("hg+")
        self.assertEqual(result, True)

    def test_is_vcs_url(self):
        result = _is_vcs_url("bzr+")
        self.assertEqual(result, True)

    def test_is_vcs_url(self):
        result = _is_vcs_url("svn")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("git")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("hg")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("bzr")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("abc")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("123")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("!@#$%^&*()_+")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("123abc")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("abc123")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("abc123abc")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("abc123abc123")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("abc123abc123abc")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("abc123abc123abc123")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("abc123abc123abc123abc")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("abc123abc123abc123abc123")
        self.assertEqual(result, False)

    def test_is_vcs_url(self):
        result = _is_vcs_url("abc123abc123abc123abc123abc")
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()