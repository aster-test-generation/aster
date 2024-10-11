import unittest
from ansible.modules.apt_repository import SourcesList


class TestSourcesList(unittest.TestCase):
    def test_add_valid_source(self):
        sources = SourcesList(None)
        sources.files = {
            'file1': [(0, True, True, 'deb http://example.com/repo', 'Test repo')],
            'file2': [(1, True, True, 'deb http://example.com/repo', 'Test repo')]
        }
        sources._add_valid_source('deb http://example.com/repo', 'Test repo', 'file1')
        self.assertEqual(sources.files['file1'], [(0, True, True, 'deb http://example.com/repo', 'Test repo'), (1, True, True, 'deb http://example.com/repo', 'Test repo')])

    def test_remove_valid_source(self):
        sources = SourcesList(None)
        sources.files = {
            'file1': [(0, True, True, 'deb http://example.com/repo', 'Test repo'), (1, True, True, 'deb http://example.com/repo2', 'Test repo2')],
            'file2': [(0, True, True, 'deb http://example.com/repo', 'Test repo')]
        }
        sources._remove_valid_source('deb http://example.com/repo')
        self.assertEqual(sources.files['file1'], [(1, True, True, 'deb http://example.com/repo2', 'Test repo2')])

    def test_parse(self):
        sources = SourcesList(None)
        sources.files = {
            'file1': [(0, True, True, 'deb http://example.com/repo', 'Test repo')],
            'file2': [(0, True, True, 'deb http://example.com/repo', 'Test repo')]
        }
        source, comment, valid = sources._parse('deb http://example.com/repo Test repo')
        self.assertEqual(source, 'deb http://example.com/repo')
        self.assertEqual(comment, 'Test repo')
        self.assertTrue(valid)

if __name__ == '__main__':
    unittest.main()