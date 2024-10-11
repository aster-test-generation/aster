import unittest
from ansible.modules.apt_repository import SourcesList


class TestSourcesList(unittest.TestCase):
    def test_add_valid_source(self):
        sources = SourcesList(None)
        sources.files = {
            'file1': [(0, True, True, 'deb http://example.com/repo1', 'Repo 1')],
            'file2': [(1, True, True, 'deb http://example.com/repo2', 'Repo 2')]
        }
        sources._add_valid_source('deb http://example.com/repo3', 'Repo 3', 'file1')
        self.assertEqual(sources.files['file1'], [
            (0, True, True, 'deb http://example.com/repo1', 'Repo 1'),
            (1, True, True, 'deb http://example.com/repo3', 'Repo 3')
        ])

    def test_remove_valid_source(self):
        sources = SourcesList(None)
        sources.files = {
            'file1': [(0, True, True, 'deb http://example.com/repo1', 'Repo 1'),
                      (1, True, True, 'deb http://example.com/repo2', 'Repo 2')],
            'file2': [(0, True, True, 'deb http://example.com/repo3', 'Repo 3')]
        }
        sources._remove_valid_source('deb http://example.com/repo2')
        self.assertEqual(sources.files['file1'], [(0, True, True, 'deb http://example.com/repo1', 'Repo 1')])

    def test_add_source(self):
        sources = SourcesList(None)
        sources.files = {
            'file1': [(0, True, True, 'deb http://example.com/repo1', 'Repo 1')]
        }
        sources.add_source('deb http://example.com/repo2', 'Repo 2', 'file1')
        self.assertEqual(sources.files['file1'], [
            (0, True, True, 'deb http://example.com/repo1', 'Repo 1'),
            (1, True, True, 'deb http://example.com/repo2', 'Repo 2')
        ])

    def test_remove_source(self):
        sources = SourcesList(None)
        sources.files = {
            'file1': [(0, True, True, 'deb http://example.com/repo1', 'Repo 1'),
                      (1, True, True, 'deb http://example.com/repo2', 'Repo 2')],
            'file2': [(0, True, True, 'deb http://example.com/repo3', 'Repo 3')]
        }
        sources.remove_source('deb http://example.com/repo2')
        self.assertEqual(sources.files['file1'], [(0, True, True, 'deb http://example.com/repo1', 'Repo 1')])

if __name__ == '__main__':
    unittest.main()