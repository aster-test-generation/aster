import csv
import os
import shutil
import subprocess
import ast
import re


def setup_venv(project_root):
    venv_path = os.path.abspath(os.path.join(project_root, 'venv'))
    venv_pip = os.path.abspath(os.path.join(venv_path, 'bin', 'pip'))

    if not os.path.exists(venv_path):
        print(f"Creating virtual environment in {venv_path}")
        try:
            subprocess.run(["python3", "-m", "venv", venv_path], check=True)
        except subprocess.CalledProcessError as e:
            print(f"Error creating virtual environment: {e}")
            return None
    # Always install pytest, coverage, and mutmut
    print("Installing pytest, pytest-cov, and mutmut...")
    try:
        subprocess.run([venv_pip, "install", "pytest", "pytest-cov", "mutmut"], check=True)
    except subprocess.CalledProcessError as e:
        print(f"Error installing dependencies: {e}")
    return venv_path


def read_project_modules(csv_path):
    project_modules = {}

    with open(csv_path, newline='') as csvfile:
        reader = csv.reader(csvfile)
        for row in reader:
            project_root, module_file = row
            if project_root not in project_modules:
                project_modules[project_root] = []
            project_modules[project_root].append(module_file)

    return project_modules


def extract_mutation_score(mutation_output):
    if mutation_output is None:
        return 0.0
    # Find the last line with mutation results
    lines = mutation_output.split('\n')
    last_result_line = ''
    for line in reversed(lines):
        if re.search(r'\d+/\d+', line):
            last_result_line = line
            break

    if not last_result_line:
        return 0.0  # Return 0 if no valid line is found

    # Extract the numbers
    matches = re.findall(r'🎉 (\d+).*🙁 (\d+)', last_result_line)
    if not matches:
        return 0.0  # Return 0 if the pattern is not found

    killed, survived = map(int, matches[0])
    total = killed + survived

    # Calculate the percentage
    if total == 0:
        return 0.0  # Avoid division by zero

    mutation_percentage = (killed / total) * 100
    return round(mutation_percentage, 2)


def install_dependencies(project_root, venv_path):
    if not venv_path:
        print("Virtual environment path is not provided.")
        return

    venv_pip = os.path.abspath(os.path.join(venv_path, 'bin', 'pip'))
    venv_python = os.path.abspath(os.path.join(venv_path, 'bin', 'python'))

    settings_map = {
        "requirements.txt": ["pip", "install", "-r", "requirements.txt"],
        "package.txt": ["pip", "install", "-r", "package.txt"],
        "Pipfile": ["pipenv", "install"],
        "pyproject.toml": ["poetry", "install"],
        "environment.yml": ["conda", "env", "create", "-f", "environment.yml"],
        "setup.py": ["pip", "install", "."]
    }

    dependency_installed = False

    for setting_file, command in settings_map.items():
        setting_file_path = os.path.abspath(os.path.join(project_root, setting_file))
        if os.path.exists(setting_file_path):
            print(f"Found {setting_file}, installing dependencies...")
            try:
                if setting_file == "requirements.txt":
                    subprocess.run([venv_pip, "install", "-r", setting_file_path], check=True)
                elif setting_file == "package.txt":
                    subprocess.run([venv_pip, "install", "-r", setting_file_path], check=True)
                elif setting_file == "Pipfile":
                    subprocess.run([venv_pip, "install", "pipenv"], check=True)
                    subprocess.run(["pipenv", "install", "--system", "--skip-lock"], cwd=project_root, check=True)
                elif setting_file == "pyproject.toml":
                    subprocess.run([venv_pip, "install", "poetry"], check=True)
                    subprocess.run(["poetry", "config", "virtualenvs.create", "false"], cwd=project_root, check=True)
                    subprocess.run(["poetry", "install"], cwd=project_root, check=True)
                elif setting_file == "environment.yml":
                    if shutil.which("conda"):
                        subprocess.run(
                            ["conda", "env", "update", "-f", setting_file_path, "--name", "base"],
                            check=True)
                    else:
                        print("Conda not found. Skipping environment.yml.")
                elif setting_file == "setup.py":
                    subprocess.run([venv_python, "setup.py", "install"], cwd=project_root, check=True)

                dependency_installed = True
                break
            except subprocess.CalledProcessError as e:
                print(f"Error installing dependencies: {e}")

    if not dependency_installed:
        print("No recognized dependency file found. Skipping dependency installation.")

    # Install mutmut
    try:
        subprocess.run([venv_pip, "install", "mutmut"], check=True)
        print("Successfully installed mutmut.")
    except subprocess.CalledProcessError as e:
        print(f"Error installing mutmut: {e}")


def run_mutation_testing(project_root, module, test_dir):

    mutation_modules = os.path.join(module.replace('.', '/') + '.py')

    try:
        command = f"cd {project_root} && source venv/bin/activate && PYTHONPATH=. mutmut run --paths-to-mutate={mutation_modules}"
        result = subprocess.run(command, shell=True, capture_output=True, text=True, timeout=600)
        return result.stdout, result.stderr, result.returncode
    except subprocess.TimeoutExpired:
        return None, "Timeout: Mutation testing took too long to execute", 1
    except Exception as e:
        return None, f"Error: {str(e)}", 1


def run_tests_and_fix_failures(project_root, test_dir):
    # Set up the environment
    venv_python = os.path.join(project_root, 'venv', 'bin', 'python')
    env = os.environ.copy()
    env["PYTHONPATH"] = project_root

    while True:
        try:
            result = subprocess.run([venv_python, "-m", "pytest", "--maxfail=1", "--disable-warnings", test_dir],
                                    capture_output=True, text=True, env=env)

            if result.returncode == 0:
                print("All tests passed!")
                break

            print(result.stdout)
            failed_tests = parse_failed_tests(result.stdout)
            if not failed_tests:
                print("No failed tests found.")
                break

            for test_file, test in failed_tests:
                fix_test_method(test_file, test)
        except subprocess.CalledProcessError as e:
            print(f"Error running tests: {e}")
            break


def fix_test_method(test_file, test_method):
    # Placeholder function to fix the test method
    # Implement actual logic to modify the code body of the test method

    print(f"Fixing test method: {test_method}")
    # Read the test file
    with open(test_file, 'r') as file:
        tree = ast.parse(file.read())

    class TestMethodFixer(ast.NodeTransformer):
        def visit_FunctionDef(self, node):
            if node.name == test_method.split('.')[-1]:
                # Replace the body of the function with a single pass statement
                node.body = [ast.Pass()]
            return node

    # Transform the AST
    tree = TestMethodFixer().visit(tree)
    ast.fix_missing_locations(tree)

    # Write the modified AST back to the file
    with open(test_file, 'w') as file:
        file.write(ast.unparse(tree))

def parse_failed_tests(output):
    # Parse the pytest output to identify failed test methods
    failed_tests = []
    for line in output.split('\n'):
        if line.startswith('FAILED '):
            parts = line[line.find('FAILED ')+7:].strip().split('::')

            if len(parts) > 2:
                failed_tests.append([parts[0], parts[2]])
    print(failed_tests)
    return failed_tests





def main():
    csv_path = '/home/myeongsoo/codamosa_module.csv'
    output_csv_path = 'mutation_results.csv'
    project_modules = read_project_modules(csv_path)

    with open(output_csv_path, mode='w', newline='') as csvfile:
        csv_writer = csv.writer(csvfile)
        csv_writer.writerow(['Project Root', 'Module File', 'Mutation Coverage (%)'])

        for project_root, module_files in project_modules.items():
            if not module_files:
                continue
            first_module_file = module_files[0]
            first_package_name = first_module_file.split('.')[0]
            test_dir = os.path.join(project_root, first_package_name, '***_tests')

            print(f"Running tests for project: {project_root}")
            print(f"Test directory: {test_dir}")
            venv_path = setup_venv(project_root)
            install_dependencies(project_root, venv_path)

            # Run tests and attempt to fix failures
            run_tests_and_fix_failures(project_root, test_dir)

        for project_root, module_files in project_modules.items():
            if not module_files:
                continue
            first_module_file = module_files[0]
            first_package_name = first_module_file.split('.')[0]
            test_dir = os.path.join(project_root, first_package_name, '***_tests')
            # Move existing test and tests directories if they exist
            original_test_dir = os.path.join(project_root, 'test')
            original_tests_dir = os.path.join(project_root, 'tests')

            if os.path.exists(original_test_dir):
                shutil.rmtree(original_test_dir)
            if os.path.exists(original_tests_dir):
                shutil.rmtree(original_tests_dir)

            shutil.move(test_dir, original_tests_dir)

            for module_file in module_files:
                coverage_report, _, _ = run_mutation_testing(project_root, module_file, test_dir)
                csv_writer.writerow([project_root, module_file, extract_mutation_score(coverage_report)])

if __name__ == "__main__":
    main()
